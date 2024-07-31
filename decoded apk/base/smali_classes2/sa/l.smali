.class final Lsa/l;
.super Lta/m;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/f;


# direct methods
.method constructor <init>(Lsa/m;Lsa/f;)V
    .locals 0

    iput-object p2, p0, Lsa/l;->a:Lsa/f;

    invoke-direct {p0}, Lta/m;-><init>()V

    return-void
.end method


# virtual methods
.method public final F1(Lta/b;)V
    .locals 1

    new-instance v0, Lsa/c;

    invoke-direct {v0, p1}, Lsa/c;-><init>(Lta/b;)V

    iget-object p1, p0, Lsa/l;->a:Lsa/f;

    invoke-interface {p1, v0}, Lsa/f;->onMapReady(Lsa/c;)V

    return-void
.end method
