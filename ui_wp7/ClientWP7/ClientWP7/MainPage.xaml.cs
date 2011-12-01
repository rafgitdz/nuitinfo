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
            Console.WriteLine("link vers la page de création du compte");
        }

        private void nicknameBox_GotFocus(object sender, RoutedEventArgs e)
        {
            nicknameBox.Text = "";
        }

        private void nicknameBox_LostFocus(object sender, RoutedEventArgs e)
        {
            nicknameBox.Text = "Your nickname";
        }

        private void passwdBox_GotFocus(object sender, RoutedEventArgs e)
        {
            passwdBox.Text = "";
        }

        private void passwdBox_LostFocus(object sender, RoutedEventArgs e)
        {
            passwdBox.Text = "Your paswword";
        }
    }
}