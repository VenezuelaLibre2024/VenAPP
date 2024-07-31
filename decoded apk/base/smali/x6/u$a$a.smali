.class final Lx6/u$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx6/u$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/os/Handler;

.field public b:Lx6/u;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lx6/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/u$a$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lx6/u$a$a;->b:Lx6/u;

    return-void
.end method
