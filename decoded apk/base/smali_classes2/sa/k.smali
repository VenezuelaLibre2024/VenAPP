.class final Lsa/k;
.super Lta/k;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/c$g;


# direct methods
.method constructor <init>(Lsa/c;Lsa/c$g;)V
    .locals 0

    iput-object p2, p0, Lsa/k;->a:Lsa/c$g;

    invoke-direct {p0}, Lta/k;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lsa/k;->a:Lsa/c$g;

    invoke-interface {v0, p1}, Lsa/c$g;->onMapLongClick(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method
