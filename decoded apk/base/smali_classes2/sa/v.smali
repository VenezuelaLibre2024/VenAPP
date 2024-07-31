.class final Lsa/v;
.super Lta/j0;
.source "SourceFile"


# instance fields
.field final synthetic a:Lsa/c$b;


# direct methods
.method constructor <init>(Lsa/c;Lsa/c$b;)V
    .locals 0

    iput-object p2, p0, Lsa/v;->a:Lsa/c$b;

    invoke-direct {p0}, Lta/j0;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb()V
    .locals 1

    iget-object v0, p0, Lsa/v;->a:Lsa/c$b;

    invoke-interface {v0}, Lsa/c$b;->onCameraMove()V

    return-void
.end method
