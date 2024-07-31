.class public Ltc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltc/a;


# instance fields
.field private final a:Lcc/a;


# direct methods
.method public constructor <init>(Lcc/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltc/e;->a:Lcc/a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Ltc/e;->a:Lcc/a;

    const-string v1, "clx"

    invoke-interface {v0, v1, p1, p2}, Lcc/a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
