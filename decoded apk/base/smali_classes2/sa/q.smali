.class final Lsa/q;
.super Lta/n0;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/c$d;


# direct methods
.method constructor <init>(Lsa/c;Lsa/c$d;)V
    .locals 0

    iput-object p2, p0, Lsa/q;->a:Lsa/c$d;

    invoke-direct {p0}, Lta/n0;-><init>()V

    return-void
.end method


# virtual methods
.method public final K1(Lcom/google/android/gms/internal/maps/zzl;)V
    .locals 1

    new-instance v0, Lua/f;

    invoke-direct {v0, p1}, Lua/f;-><init>(Lcom/google/android/gms/internal/maps/zzl;)V

    iget-object p1, p0, Lsa/q;->a:Lsa/c$d;

    invoke-interface {p1, v0}, Lsa/c$d;->onCircleClick(Lua/f;)V

    return-void
.end method
