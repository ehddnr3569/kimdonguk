using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassTest2.Util
{
    class RandData
    {
        string[] name = { "홍길동", "김길동", "이길동", "박길동", "최길동" };
        int[] age = { 30, 40, 50, 60, 70 };
        string[] tel = { "010-1111-2222", "010-2222-3333", "010-3333-4444", "010-4444-5555", "010-1234-1234" };
        char[] gender = { '남', '여' };
        string[] addr = { "서울 동구 신천1동", "대구 동구 신천2동" , "부산 동구 신천3동" , "광주 동구 신천4동" , "울산 동구 신천5동" };
        string[] jikwi = { "주임", "대리", "과장", "차장", "부장" };
        string[] office = { "동서울영업소", "동대구영업소", "동부산영업소", "광주영업소", "울산영업소" };
        string[] model = { "K7", "K8", "그랜저", "제네시스", "SM6" };
        string[] color = { "검정", "흰색", "은색", "파랑", "진주색" };
        string[] price = { "3천만원", "4천만원", "5천만원", "6천만원", "7천만원" };
        string[] company = { "현대", "KIA", "삼성르노", "쌍용", "GM" };

        Random r = new Random();

        public string getName()
        {
            return name[r.Next(5)];
        }

        public int getAge()
        {
            return age[r.Next(5)];
        }

        public string gettel()
        {
            return tel[r.Next(5)];
        }

        public int getgender()
        {
            return gender[r.Next(5)];
        }

        public string getaddr()
        {
            return addr[r.Next(5)];
        }

        public string getjikwi()
        {
            return jikwi[r.Next(5)];
        }
        public string getoffice()
        {
            return office[r.Next(5)];
        }
        public string getmodel()
        {
            return model[r.Next(5)];
        }
        public string getcolor()
        {
            return color[r.Next(5)];
        }
        public string getprice()
        {
            return price[r.Next(5)];
        }
        public string getcompany()
        {
            return company[r.Next(5)];
        }

    }
}
