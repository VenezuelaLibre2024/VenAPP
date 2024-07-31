.class final Lv6/h0$j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv6/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "j"
.end annotation


# instance fields
.field public final a:Lt6/i3;

.field public final b:Z

.field public final c:J

.field public final d:J


# direct methods
.method private constructor <init>(Lt6/i3;ZJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/h0$j;->a:Lt6/i3;

    iput-boolean p2, p0, Lv6/h0$j;->b:Z

    iput-wide p3, p0, Lv6/h0$j;->c:J

    iput-wide p5, p0, Lv6/h0$j;->d:J

    return-void
.end method

.method synthetic constructor <init>(Lt6/i3;ZJJLv6/h0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lv6/h0$j;-><init>(Lt6/i3;ZJJ)V

    return-void
.end method
