.class final Lua/k0;
.super Lcom/google/android/gms/internal/maps/zzao;
.source "SourceFile"


# instance fields
.field final synthetic a:Lua/d0;


# direct methods
.method constructor <init>(Lua/c0;Lua/d0;)V
    .locals 0

    iput-object p2, p0, Lua/k0;->a:Lua/d0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/maps/zzao;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(III)Lua/a0;
    .locals 1

    iget-object v0, p0, Lua/k0;->a:Lua/d0;

    invoke-interface {v0, p1, p2, p3}, Lua/d0;->getTile(III)Lua/a0;

    move-result-object p1

    return-object p1
.end method
