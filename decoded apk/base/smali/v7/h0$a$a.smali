.class final Lv7/h0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/h0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/os/Handler;

.field public b:Lv7/h0;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lv7/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/h0$a$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lv7/h0$a$a;->b:Lv7/h0;

    return-void
.end method
