.class final Lsa/w;
.super Lta/h0;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/c$a;


# direct methods
.method constructor <init>(Lsa/c;Lsa/c$a;)V
    .locals 0

    iput-object p2, p0, Lsa/w;->a:Lsa/c$a;

    invoke-direct {p0}, Lta/h0;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb()V
    .locals 1

    iget-object v0, p0, Lsa/w;->a:Lsa/c$a;

    invoke-interface {v0}, Lsa/c$a;->onCameraIdle()V

    return-void
.end method
