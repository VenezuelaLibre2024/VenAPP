.class final Lsa/p;
.super Lta/g;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/c$e;


# direct methods
.method constructor <init>(Lsa/c;Lsa/c$e;)V
    .locals 0

    iput-object p2, p0, Lsa/p;->a:Lsa/c$e;

    invoke-direct {p0}, Lta/g;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/maps/zzad;)V
    .locals 1

    new-instance v0, Lua/m;

    invoke-direct {v0, p1}, Lua/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    iget-object p1, p0, Lsa/p;->a:Lsa/c$e;

    invoke-interface {p1, v0}, Lsa/c$e;->onInfoWindowClick(Lua/m;)V

    return-void
.end method
