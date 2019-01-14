using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnButton3Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton4Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton5Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton6Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton10Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton9Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton8Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton7Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton18Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton17Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton12Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton14Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton16Pressed(object sender, EventArgs e)
    {
    }

    protected void OnButton16Clicked(object sender, EventArgs e)
    {
    }
}
