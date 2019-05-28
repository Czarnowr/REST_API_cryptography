**Cryptography Demo REST API**
----
  _Returns json message after encoding / decoding_

* **URL**

    * **Base URL:**

        `https://czarnowr-cryptography.herokuapp.com/api`

    * **Atbash:** 
    
       `/encode/atbash` 
    
       `/decode/atbash`
    
    * **Rot13:**
    
       `/encode/rot13` 
        
       `/decode/rot13` 

* **Method:**

  `POST`
  
*  **URL Params**

   **Required:**
 
   `n/a`

   **Optional:**
 
   `n/a`

* **Data Params**

  **Content:** `{ "request" : "text to process" }`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ "response" : "text after processing" }`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />
    **Content:** `{ error : Input does not contain letters }`  
    
    * **Code:** 422 UNPROCESSABLE ENTRY <br />
    **Content:** `{ error : Cannot process an empty String, please provide input }`

* **Sample Call:**
        
  * **Address:** `https://czarnowr-cryptography.herokuapp.com/api/encode/atbash`
        
  * **Method:**  `POST`
        
  * **Body:**    `{ "request" : "Sample message" }`  
     
     
  * **Address:** `https://czarnowr-cryptography.herokuapp.com/api/decode/atbash`
          
    * **Method:**  `POST`
          
    * **Body:**    `{ "request" : "hznkov nvhhztv" }` 

* **Notes:**

    `In development`