using System;
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
        
        
        public UserPage()
        {
            InitializeComponent();
        }

        private void AddWish_Click(object sender, RoutedEventArgs e)
        {
            List<string> wishListDure = new List<string>();
            IEnumerable<string> temp;
            temp = (IEnumerable<string>) wishList.ItemsSource;
            if (temp != null)
                wishListDure = temp.ToList();

            wishListDure.Add("Wish");
            wishList.ItemsSource = wishListDure;
        }

        private void ModifyWish_Click(object sender, RoutedEventArgs e)
        {

        }

        private void DeleteWish_Click(object sender, RoutedEventArgs e)
        {
            List<string> wishListDure = new List<string>();
            IEnumerable<string> temp;
            temp = (IEnumerable<string>)wishList.ItemsSource;
            if (temp != null)
                wishListDure = temp.ToList();

            wishListDure.Add("Wish");
            wishList.ItemsSource = wishListDure;
        }

        private void AddContact_Click(object sender, RoutedEventArgs e)
        {
            List<string> contactListDure = new List<string>();
            IEnumerable<string> temp;
            temp = (IEnumerable<string>)ContactList.ItemsSource;
            if (temp != null)
                contactListDure = temp.ToList();

            contactListDure.Add("Contact");
            ContactList.ItemsSource = contactListDure;
        }

        private void ModifyContact_Click(object sender, RoutedEventArgs e)
        {

        }

        private void DeleteContact_Click(object sender, RoutedEventArgs e)
        {

        }

        private void CreateGroupContact_Click(object sender, RoutedEventArgs e)
        {

        }

        private void button1_Click(object sender, RoutedEventArgs e)
        {

        }
    }
}