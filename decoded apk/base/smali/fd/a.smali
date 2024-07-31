.class public final Lfd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfd/a$g;,
        Lfd/a$h;,
        Lfd/a$f;,
        Lfd/a$d;,
        Lfd/a$e;,
        Lfd/a$b;,
        Lfd/a$c;
    }
.end annotation


# instance fields
.field private final a:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfd/a;->a:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lfd/a;->a:Landroid/os/Bundle;

    invoke-static {v0}, Lgd/g;->f(Landroid/os/Bundle;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
