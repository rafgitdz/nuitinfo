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
    public partial class GroupManagement : PhoneApplicationPage
    {
        public GroupManagement()
        {
            InitializeComponent();
        }

        private void groupName_GotFocus(object sender, RoutedEventArgs e)
        {
            if (groupName.Text == "Your group Name")
            {
                groupName.Text = "";
            }
        }

        private void groupName_LostFocus(object sender, RoutedEventArgs e)
        {
            if (groupName.Text == "")
            {
                groupName.Text = "Your group Name";
            }
        }

        private void cancelGroup_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/UserPage.xaml", UriKind.RelativeOrAbsolute));
        }

        private void createGroup_Click(object sender, RoutedEventArgs e)
        {

        }
    }
}