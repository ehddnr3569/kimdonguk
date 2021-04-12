using ClassTest2.Controll;
using ClassTest2.Model;
using ClassTest2.Util;
using ClassTest2.View;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassTest2
{
    class Program
    {

        static void Main(string[] args)
        {
            Menu menu = new Menu();
            RandData rand = new RandData();
            CarController carCon = new CarController(rand);
            while (true)
            {
                switch (menu.mainMenu())
                {
                    case Menu.MENU_MAIN_RAND:
                        carCon.insRandData(menu.getRandSize());
                        break;
                    case Menu.MENU_MAIN_DEL_ALL:
                        break;
                    case Menu.MENU_MAIN_VIEW:
                        break;
                    case Menu.MENU_MAIN_ADD:
                        break;
                    case Menu.MENU_MAIN_DEL:
                        break;
                    case Menu.MENU_MAIN_UPDATE:
                        break;
                    case Menu.MENU_MAIN_EXIT:
                        Environment.Exit(0);
                        break;
                }
            }
        }
    }
}
