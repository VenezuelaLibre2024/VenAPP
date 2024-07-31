.class final Lck/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lck/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lck/g;

    invoke-direct {v0}, Lck/g;-><init>()V

    sput-object v0, Lck/g;->a:Lck/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lck/f;
    .locals 4

    new-instance v0, Lck/f;

    const/16 v1, 0x9

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, Lck/f;-><init>(III)V

    return-object v0
.end method
