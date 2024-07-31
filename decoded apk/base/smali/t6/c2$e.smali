.class public final Lt6/c2$e;
.super Lt6/c2$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final x:Lt6/c2$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt6/c2$d$a;

    invoke-direct {v0}, Lt6/c2$d$a;-><init>()V

    invoke-virtual {v0}, Lt6/c2$d$a;->g()Lt6/c2$e;

    move-result-object v0

    sput-object v0, Lt6/c2$e;->x:Lt6/c2$e;

    return-void
.end method

.method private constructor <init>(Lt6/c2$d$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lt6/c2$d;-><init>(Lt6/c2$d$a;Lt6/c2$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lt6/c2$d$a;Lt6/c2$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/c2$e;-><init>(Lt6/c2$d$a;)V

    return-void
.end method
