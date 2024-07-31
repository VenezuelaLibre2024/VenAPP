.class final Lqg/k$c;
.super Lkg/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final c:Lqg/m;

.field private final d:I


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;ILqg/m;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lkg/n;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;I)V

    iput-object p4, p0, Lqg/k$c;->c:Lqg/m;

    iput p5, p0, Lqg/k$c;->d:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;ILqg/m;ILqg/k$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lqg/k$c;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;ILqg/m;I)V

    return-void
.end method

.method static synthetic i(Lqg/k$c;)I
    .locals 0

    invoke-direct {p0}, Lqg/k$c;->k()I

    move-result p0

    return p0
.end method

.method static synthetic j(Lqg/k$c;)Lqg/m;
    .locals 0

    invoke-direct {p0}, Lqg/k$c;->l()Lqg/m;

    move-result-object p0

    return-object p0
.end method

.method private k()I
    .locals 1

    iget v0, p0, Lqg/k$c;->d:I

    return v0
.end method

.method private l()Lqg/m;
    .locals 1

    iget-object v0, p0, Lqg/k$c;->c:Lqg/m;

    return-object v0
.end method
