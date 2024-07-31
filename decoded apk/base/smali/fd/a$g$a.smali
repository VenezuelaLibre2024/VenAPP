.class public final Lfd/a$g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfd/a$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lfd/a$g$a;->a:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public a()Lfd/a$g;
    .locals 3

    new-instance v0, Lfd/a$g;

    iget-object v1, p0, Lfd/a$g$a;->a:Landroid/os/Bundle;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfd/a$g;-><init>(Landroid/os/Bundle;Lfd/a$a;)V

    return-object v0
.end method

.method public b(Z)Lfd/a$g$a;
    .locals 2

    iget-object v0, p0, Lfd/a$g$a;->a:Landroid/os/Bundle;

    const-string v1, "efr"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method
