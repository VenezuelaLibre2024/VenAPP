.class final Lsa/s;
.super Lta/v;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/c$k;


# direct methods
.method constructor <init>(Lsa/c;Lsa/c$k;)V
    .locals 0

    iput-object p2, p0, Lsa/s;->a:Lsa/c$k;

    invoke-direct {p0}, Lta/v;-><init>()V

    return-void
.end method


# virtual methods
.method public final I0(Lcom/google/android/gms/internal/maps/zzaj;)V
    .locals 1

    new-instance v0, Lua/s;

    invoke-direct {v0, p1}, Lua/s;-><init>(Lcom/google/android/gms/internal/maps/zzaj;)V

    iget-object p1, p0, Lsa/s;->a:Lsa/c$k;

    invoke-interface {p1, v0}, Lsa/c$k;->onPolylineClick(Lua/s;)V

    return-void
.end method
