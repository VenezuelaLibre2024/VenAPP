.class final Ldf/x$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field public static final a:Ldf/x$c;

.field private static final b:La1/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La1/d$a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldf/x$c;

    invoke-direct {v0}, Ldf/x$c;-><init>()V

    sput-object v0, Ldf/x$c;->a:Ldf/x$c;

    const-string v0, "session_id"

    invoke-static {v0}, La1/f;->f(Ljava/lang/String;)La1/d$a;

    move-result-object v0

    sput-object v0, Ldf/x$c;->b:La1/d$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()La1/d$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La1/d$a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Ldf/x$c;->b:La1/d$a;

    return-object v0
.end method
