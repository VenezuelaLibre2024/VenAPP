.class public final Lhc/c;
.super Lec/d;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lzb/m;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lzb/m;)V
    .locals 0

    invoke-direct {p0}, Lec/d;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, Lhc/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lhc/c;->b:Lzb/m;

    return-void
.end method

.method public static c(Lec/c;)Lhc/c;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lhc/c;

    invoke-virtual {p0}, Lec/c;->b()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhc/c;-><init>(Ljava/lang/String;Lzb/m;)V

    return-object v0
.end method

.method public static d(Lzb/m;)Lhc/c;
    .locals 2

    new-instance v0, Lhc/c;

    invoke-static {p0}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzb/m;

    const-string v1, "eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ=="

    invoke-direct {v0, v1, p0}, Lhc/c;-><init>(Ljava/lang/String;Lzb/m;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lhc/c;->b:Lzb/m;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhc/c;->a:Ljava/lang/String;

    return-object v0
.end method
