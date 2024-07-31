.class final Lsa/j;
.super Lta/o;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/c$h;


# direct methods
.method constructor <init>(Lsa/c;Lsa/c$h;)V
    .locals 0

    iput-object p2, p0, Lsa/j;->a:Lsa/c$h;

    invoke-direct {p0}, Lta/o;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/maps/zzad;)Z
    .locals 1

    new-instance v0, Lua/m;

    invoke-direct {v0, p1}, Lua/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    iget-object p1, p0, Lsa/j;->a:Lsa/c$h;

    invoke-interface {p1, v0}, Lsa/c$h;->onMarkerClick(Lua/m;)Z

    move-result p1

    return p1
.end method
