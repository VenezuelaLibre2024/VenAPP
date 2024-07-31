.class final Lsa/r;
.super Lta/t;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/c$j;


# direct methods
.method constructor <init>(Lsa/c;Lsa/c$j;)V
    .locals 0

    iput-object p2, p0, Lsa/r;->a:Lsa/c$j;

    invoke-direct {p0}, Lta/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final w1(Lcom/google/android/gms/internal/maps/zzag;)V
    .locals 1

    new-instance v0, Lua/q;

    invoke-direct {v0, p1}, Lua/q;-><init>(Lcom/google/android/gms/internal/maps/zzag;)V

    iget-object p1, p0, Lsa/r;->a:Lsa/c$j;

    invoke-interface {p1, v0}, Lsa/c$j;->onPolygonClick(Lua/q;)V

    return-void
.end method
