using System;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Shapes;

namespace ClientWP7
{
    public enum Visibility { Private,Public};

    public class Wish
    {
        public string Name { get; set; }
        public string Group { get; set; }
        public Visibility Visibility {get;set;}

        public Wish(string name, string group, Visibility visibilty)
        {
            this.Name = name;
            this.Group = group;
            this.Visibility = visibilty;
        }
    }
}
