using ClassTest2_1.Controll;
using ClassTest2_1.Model;
using ClassTest2_1.Util;
using ClassTest2_1.View;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassTest2_1
{
    class Program
    {
        static void Main(string[] args)
        {
            Menu menu = new Menu();
            UnionController uHandler =
                new UnionController(new RandData());

            while (true)
            {
                switch (menu.mainMenu())
                {
                    case Menu.MENU_MAIN_RAND:
                        carCon.insRandData(menu.getRandSize());
                        custCon.insRandData(menu.getRandSize());
                        sellCon.insRandData(menu.getRandSize());
                        break;
                    case Menu.MENU_MAIN_DEL_ALL:
                        carCon.removeAll();
                        custCon.removeAll();
                        sellCon.removeAll();
                        break;
                    case Menu.MENU_MAIN_VIEW:
                        carCon.carView();
                        custCon.custView();
                        sellCon.sellView();
                        break;
                    case Menu.MENU_MAIN_ADD:
                        switch (menu.subAddMenu())
                        {
                            case Menu.MENU_SUB_ADD_CAR:
                                carCon.addCarItem(
                                    menu.addCarMenu2());
                                break;
                            case Menu.MENU_SUB_ADD_CUST:
                                custCon.addCustItem(
                                    menu.addCustMenu());
                                break;
                            case Menu.MENU_SUB_ADD_SELL:
                                sellCon.addSellItem(
                                    menu.addSellMenu());
                                break;
                            case Menu.MENU_SUB_ADD_EXIT:
                                break;
                        }                        
                        break;
                    case Menu.MENU_MAIN_DEL:
                        switch (menu.subDelMenu())
                        {
                            case Menu.MENU_SUB_DEL_CAR:
                                carCon.delCarItem(menu.delCarMenu());
                                break;
                            case Menu.MENU_SUB_DEL_CUST:
                                custCon.delCustItem(menu.delCustMenu());
                                break;
                            case Menu.MENU_SUB_DEL_SELL:
                                sellCon.delSellItem(menu.delSellMenu());
                                break;
                            case Menu.MENU_SUB_DEL_EXIT:
                                break;
                        }
                        break;
                    case Menu.MENU_MAIN_UPDATE:
                        switch (menu.subUpdateMenu())
                        {
                            case Menu.MENU_SUB_UP_CAR:
                                carCon.updateCarItem(menu.updateCarMenu());
                                break;
                            case Menu.MENU_SUB_UP_CUST:
                                custCon.updateCustItem(menu.updateCustMenu());
                                break;
                            case Menu.MENU_SUB_UP_SELL:
                                sellCon.updateSellItem(menu.updateSellMenu());
                                break;
                            case Menu.MENU_SUB_UP_EXIT:
                                break;
                        }
                        break;
                    case Menu.MENU_MAIN_EXIT:
                        Environment.Exit(0);
                        break;
                }
            }
        }
    }
}
