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
    public partial class Registration : PhoneApplicationPage
    {
        public Registration()
        {
            InitializeComponent();
        }

        private void tbUserName_GotFocus(object sender, RoutedEventArgs e)
        {

        }

        private void tbUserName_LostFocus(object sender, RoutedEventArgs e)
        {

        }

        private void tbName_LostFocus(object sender, RoutedEventArgs e)
        {

        }

        private void tbName_GotFocus(object sender, RoutedEventArgs e)
        {

        }

        private void btnValidate_Click(object sender, RoutedEventArgs e)
        {
            Console.WriteLine("Gagné");
        }
    }
}