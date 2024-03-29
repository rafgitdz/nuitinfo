﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Shapes;
using Microsoft.Phone.Controls;
using System.ComponentModel;

namespace ClientWP7
{
    public partial class UserPage : PhoneApplicationPage
    {

        public List<Wish> Wishes { get; set; }
        
        public UserPage()
        {
            InitializeComponent();
        }


        protected override void OnNavigatedTo(System.Windows.Navigation.NavigationEventArgs e)
        {
            base.OnNavigatedTo(e);
            string msg = "";
            if (NavigationContext.QueryString.TryGetValue("msg", out msg))
            {
                //List<Wish> wishes = new List<Wish>();
                if (Wishes == null)
                {
                    Wishes = new List<Wish>();
                }
                Wishes.Add(new Wish(msg,string.Empty,ClientWP7.Visibility.Public));
                //List<string> wishListDure = new List<string>();
                //IEnumerable<string> temp;
                //temp = (IEnumerable<string>)wishList.ItemsSource;
                //if (temp != null)
                //    wishListDure = temp.ToList();

                //wishListDure.Add(msg);
                wishList.ItemsSource = Wishes;
                
            }
        }
        private void AddWish_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/WishRegistration.xaml", UriKind.RelativeOrAbsolute));
        }

        private void ModifyWish_Click(object sender, RoutedEventArgs e)
        {

        }

        private void DeleteWish_Click(object sender, RoutedEventArgs e)
        {
            //Wishes.Remove(
        }

        private void AddContact_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/SendInvite.xaml", UriKind.RelativeOrAbsolute));
            /*List<string> contactListDure = new List<string>();
            IEnumerable<string> temp;
            temp = (IEnumerable<string>)ContactList.ItemsSource;
            if (temp != null)
                contactListDure = temp.ToList();

            contactListDure.Add("Contact");
            ContactList.ItemsSource = contactListDure;*/
        }

        private void ModifyContact_Click(object sender, RoutedEventArgs e)
        {

        }

        private void DeleteContact_Click(object sender, RoutedEventArgs e)
        {

        }

        private void CreateGroupContact_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/GroupManagement.xaml", UriKind.RelativeOrAbsolute));
        }

        private void button1_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/UserProfile.xaml", UriKind.RelativeOrAbsolute));
        }
    }
}