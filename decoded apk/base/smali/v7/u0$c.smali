.class final Lv7/u0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field public final a:Lt6/u1;

.field public final b:Lx6/v$b;


# direct methods
.method private constructor <init>(Lt6/u1;Lx6/v$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/u0$c;->a:Lt6/u1;

    iput-object p2, p0, Lv7/u0$c;->b:Lx6/v$b;

    return-void
.end method

.method synthetic constructor <init>(Lt6/u1;Lx6/v$b;Lv7/u0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv7/u0$c;-><init>(Lt6/u1;Lx6/v$b;)V

    return-void
.end method
