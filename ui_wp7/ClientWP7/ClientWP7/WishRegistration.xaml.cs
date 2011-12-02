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
    public partial class WishRegistration : PhoneApplicationPage
    {
        public WishRegistration()
        {
            InitializeComponent();
        }

        private void btnValidate_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/UserPage.xaml?msg=" +   tbWishName.Text, UriKind.RelativeOrAbsolute));
        }
    }
}