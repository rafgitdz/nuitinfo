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
    public partial class SendInvite : PhoneApplicationPage
    {
        public SendInvite()
        {
            InitializeComponent();
        }

        private void invite_Click(object sender, RoutedEventArgs e)
        {

        }

        private void nicknameInvite_GotFocus(object sender, RoutedEventArgs e)
        {
            if (nicknameInvite.Text == "your friend's nickname")
            {
                nicknameInvite.Text = "";
            }
        }

        private void nicknameInvite_LostFocus(object sender, RoutedEventArgs e)
        {
            if (nicknameInvite.Text == "")
            {
                nicknameInvite.Text = "your friend's nickname";
            }
        }

        private void CancelInvite_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/UserPage.xaml", UriKind.RelativeOrAbsolute));
        }
    }
}