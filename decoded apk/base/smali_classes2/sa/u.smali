.class final Lsa/u;
.super Lta/l0;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/c$c;


# direct methods
.method constructor <init>(Lsa/c;Lsa/c$c;)V
    .locals 0

    iput-object p2, p0, Lsa/u;->a:Lsa/c$c;

    invoke-direct {p0}, Lta/l0;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(I)V
    .locals 1

    iget-object v0, p0, Lsa/u;->a:Lsa/c$c;

    invoke-interface {v0, p1}, Lsa/c$c;->onCameraMoveStarted(I)V

    return-void
.end method
