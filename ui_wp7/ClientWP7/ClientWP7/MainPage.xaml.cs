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

namespace ClientWP7
{
    public partial class MainPage : PhoneApplicationPage
    {
        // Constructeur
        public MainPage()
        {
            InitializeComponent();
        }

        private void createAccount_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/UserPage.xaml", UriKind.RelativeOrAbsolute));
        }

        private void nicknameBox_GotFocus(object sender, RoutedEventArgs e)
        {
            if (nicknameBox.Text == "Your nickname")
            {
                nicknameBox.Text = "";
            }
        }

        private void nicknameBox_LostFocus(object sender, RoutedEventArgs e)
        {
            if (nicknameBox.Text == "")
            {
                nicknameBox.Text = "Your nickname";
            }
        }

        private void loginButton_Click(object sender, RoutedEventArgs e)
        {
            if ((nicknameBox.Text == "test") && (passwordBox.Password == "toto")) 
            {

                NavigationService.Navigate(new Uri("/UserPage.xaml", UriKind.RelativeOrAbsolute));

            }
        }

        private void passwordBox_GotFocus(object sender, RoutedEventArgs e)
        {
            if (passwordBox.Password == "Your password")
            {
                passwordBox.Password = "";
            }
        }

        private void passwordBox_LostFocus(object sender, RoutedEventArgs e)
        {
            if (passwordBox.Password == "")
            {
                passwordBox.Password = "Your password";
            }
        }

        private void button1_Click(object sender, RoutedEventArgs e)
        {
            if (searchUserBox.Text != string.Empty && searchUserBox.Text != "user")
            {
                NavigationService.Navigate(new Uri("/SearchResults.xaml", UriKind.RelativeOrAbsolute));
            }
        }
    }
}