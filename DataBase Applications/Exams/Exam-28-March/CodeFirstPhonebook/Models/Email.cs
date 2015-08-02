﻿namespace CodeFirstPhonebook.Models
{
    using System.ComponentModel.DataAnnotations;

    public class Email
    {
        public int Id { get; set; }

        [Required]
        public string EmailAddres { get; set; }

        public int ContactId { get; set; }

        public Contact Contact { get; set; }
    }
}