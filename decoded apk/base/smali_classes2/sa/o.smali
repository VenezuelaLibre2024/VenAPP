.class final Lsa/o;
.super Lta/q;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/c$i;


# direct methods
.method constructor <init>(Lsa/c;Lsa/c$i;)V
    .locals 0

    iput-object p2, p0, Lsa/o;->a:Lsa/c$i;

    invoke-direct {p0}, Lta/q;-><init>()V

    return-void
.end method


# virtual methods
.method public final B(Lcom/google/android/gms/internal/maps/zzad;)V
    .locals 1

    new-instance v0, Lua/m;

    invoke-direct {v0, p1}, Lua/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    iget-object p1, p0, Lsa/o;->a:Lsa/c$i;

    invoke-interface {p1, v0}, Lsa/c$i;->onMarkerDragEnd(Lua/m;)V

    return-void
.end method

.method public final G1(Lcom/google/android/gms/internal/maps/zzad;)V
    .locals 1

    new-instance v0, Lua/m;

    invoke-direct {v0, p1}, Lua/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    iget-object p1, p0, Lsa/o;->a:Lsa/c$i;

    invoke-interface {p1, v0}, Lsa/c$i;->onMarkerDragStart(Lua/m;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/maps/zzad;)V
    .locals 1

    new-instance v0, Lua/m;

    invoke-direct {v0, p1}, Lua/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    iget-object p1, p0, Lsa/o;->a:Lsa/c$i;

    invoke-interface {p1, v0}, Lsa/c$i;->onMarkerDrag(Lua/m;)V

    return-void
.end method
