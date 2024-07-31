.class public final Lfd/a$e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfd/a$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lfd/a$e$a;->a:Landroid/os/Bundle;

    const-string v1, "ibi"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Lfd/a$e;
    .locals 3

    new-instance v0, Lfd/a$e;

    iget-object v1, p0, Lfd/a$e$a;->a:Landroid/os/Bundle;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfd/a$e;-><init>(Landroid/os/Bundle;Lfd/a$a;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lfd/a$e$a;
    .locals 2

    iget-object v0, p0, Lfd/a$e$a;->a:Landroid/os/Bundle;

    const-string v1, "isi"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lfd/a$e$a;
    .locals 2

    iget-object v0, p0, Lfd/a$e$a;->a:Landroid/os/Bundle;

    const-string v1, "ius"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public d(Landroid/net/Uri;)Lfd/a$e$a;
    .locals 2

    iget-object v0, p0, Lfd/a$e$a;->a:Landroid/os/Bundle;

    const-string v1, "ifl"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lfd/a$e$a;
    .locals 2

    iget-object v0, p0, Lfd/a$e$a;->a:Landroid/os/Bundle;

    const-string v1, "ipbi"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public f(Landroid/net/Uri;)Lfd/a$e$a;
    .locals 2

    iget-object v0, p0, Lfd/a$e$a;->a:Landroid/os/Bundle;

    const-string v1, "ipfl"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lfd/a$e$a;
    .locals 2

    iget-object v0, p0, Lfd/a$e$a;->a:Landroid/os/Bundle;

    const-string v1, "imv"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
