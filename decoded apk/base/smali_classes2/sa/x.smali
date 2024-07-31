.class final Lsa/x;
.super Lta/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/c$f;


# direct methods
.method constructor <init>(Lsa/c;Lsa/c$f;)V
    .locals 0

    iput-object p2, p0, Lsa/x;->a:Lsa/c$f;

    invoke-direct {p0}, Lta/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lsa/x;->a:Lsa/c$f;

    invoke-interface {v0, p1}, Lsa/c$f;->onMapClick(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method
