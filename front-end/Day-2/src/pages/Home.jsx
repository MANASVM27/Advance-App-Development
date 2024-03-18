import React from 'react';
import { Link } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';


const Home = () => {
  const navigate=useNavigate();
    const handleSubmit = (e) => {
      e.preventDefault();
    }
  return (
    <div>
      
      <section className="bg-cover bg-center h-screen" style={{ backgroundImage: 'url("https://res.cloudinary.com/dfrc94azr/image/upload/v1710569243/wallpaperflare.com_wallpaper_9_y9x0ma.jpg")' }}>
        <div className="h-full flex flex-col justify-center items-center text-white">
          <h1 className="text-4xl md:text-6xl font-bold mb-4 text-center">Welcome to Boating Voyager</h1>
          <h1 className="text-4xl md:text-6xl font-bold mb-4 text-center">A Perfect Weekend Getaway</h1>
          <p className="text-lg md:text-xl text-center max-w-lg mb-8">Experience the serenity of the open water. Explore, relax, and enjoy unforgettable moments on our luxurious boats.</p>
          <Link to="/login" className="bg-blue-500 hover:bg-blue-600 text-white font-bold py-3 px-6 rounded-full transition duration-300">Book Now</Link>
        </div>
      </section>

      <section className="bg-gray-100 py-16">
        <div className="container mx-auto">
          <h2 className="text-3xl md:text-4xl font-bold mb-8 text-center">About Us</h2>
          <div className="flex flex-col md:flex-row items-center justify-center">
            <div className="md:w-1/2 md:mr-8 mb-8 md:mb-0">
              <img src="https://res.cloudinary.com/dfrc94azr/image/upload/v1710566094/wallpaperflare.com_wallpaper_8_owqp4x.jpg" alt="About" className="w-full h-auto rounded-lg" />
            </div>
            <div className="md:w-1/1">
              <p className="text-lg mb-4">At Boating Paradise, we're passionate about providing you with the best boating experience. Whether you're a seasoned sailor or new to the water, we have the perfect vessel for your adventure.</p>
              <p className="text-lg">Our fleet consists of top-of-the-line boats equipped with modern amenities and safety features. Join us and embark on a journey you'll never forget.</p>
            </div>
          </div>
        </div>
      </section>

      <section className="py-16">
        <div className="container mx-auto">
          <h2 className="text-3xl md:text-4xl font-bold mb-8 text-center">Our Services</h2>
          <div className="grid grid-cols-1 md:grid-cols-3 gap-8">
            <div className="bg-white rounded-lg shadow-md p-6">
              <h3 className="text-xl font-bold mb-4">Boat Rentals</h3>
              <p className="text-lg">Choose from our diverse range of boats for rent, suitable for any occasion or preference.</p>
            </div>
            <div className="bg-white rounded-lg shadow-md p-6">
              <h3 className="text-xl font-bold mb-4">Guided Tours</h3>
              <p className="text-lg">Explore the wonders of the water with our experienced guides leading the way.</p>
            </div>
            <div className="bg-white rounded-lg shadow-md p-6">
              <h3 className="text-xl font-bold mb-4">Events & Charters</h3>
              <p className="text-lg">Host your special events or celebrations aboard our luxurious charter boats.</p>
            </div>
          </div>
        </div>
      </section>

      <section className="bg-gray-100 py-16">
        <div className="container mx-auto">
          <h2 className="text-3xl md:text-4xl font-bold mb-8 text-center">What Our Customers Say</h2>
          <div className="grid grid-cols-1 md:grid-cols-2 gap-8">
            <div className="bg-white rounded-lg shadow-md p-6">
              <blockquote className="text-lg">"An unforgettable experience! The boat was in impeccable condition, and the staff were friendly and accommodating. Highly recommended!"</blockquote>
              <cite className="block mt-4 text-gray-500">- Mohamed Haaris</cite>
            </div>
            <div className="bg-white rounded-lg shadow-md p-6">
              <blockquote className="text-lg">"I booked a guided tour with Boating Paradise, and it exceeded all my expectations. The scenery was breathtaking, and the captain was knowledgeable. Will definitely come back!"</blockquote>
              <cite className="block mt-4 text-gray-500">- Mohamed Hajith</cite>
            </div>
          </div>
        </div>
      </section>
      
      <section className="py-16">
        <div className="container mx-auto">
          <h2 className="text-3xl md:text-4xl font-bold mb-8 text-center">Contact Us</h2>
          <p className="text-lg text-center mb-8">Have questions or ready to book your next adventure? Reach out to us today!</p>
          <div className="flex justify-center">
            <p className="bg-blue-500 hover:bg-blue-600 text-white font-bold py-3 px-6 rounded-full transition duration-300" onClick={()=>navigate('/contact')}>Contact Us</p>
          </div>
        </div>
      </section>
      
      <footer className="bg-gray-900 text-white py-8">
        <div className="container mx-auto text-center">
          <p>&copy; 2024 Boating Voyager. All rights reserved.</p>
        </div>
      </footer>
    </div>
  );
}

export default Home;
