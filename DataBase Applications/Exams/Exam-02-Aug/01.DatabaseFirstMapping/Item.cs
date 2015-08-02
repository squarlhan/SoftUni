//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace _01.DatabaseFirstMapping
{
    using System;
    using System.Collections.Generic;
    
    public partial class Item
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public Item()
        {
            this.GameTypes = new HashSet<GameType>();
            this.UsersGames = new HashSet<UsersGame>();
        }
    
        public int Id { get; set; }
        public string Name { get; set; }
        public int ItemTypeId { get; set; }
        public int StatisticId { get; set; }
        public decimal Price { get; set; }
        public int MinLevel { get; set; }
    
        public virtual ItemType ItemType { get; set; }
        public virtual Statistic Statistic { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<GameType> GameTypes { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<UsersGame> UsersGames { get; set; }
    }
}
