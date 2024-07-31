.class public final Ldf/b0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Ldf/b0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldf/b0$a;

    invoke-direct {v0}, Ldf/b0$a;-><init>()V

    sput-object v0, Ldf/b0$a;->a:Ldf/b0$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ldf/b0;
    .locals 2

    sget-object v0, Lzb/c;->a:Lzb/c;

    invoke-static {v0}, Lzb/n;->a(Lzb/c;)Lzb/g;

    move-result-object v0

    const-class v1, Ldf/b0;

    invoke-virtual {v0, v1}, Lzb/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Firebase.app[SessionFirelogPublisher::class.java]"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ldf/b0;

    return-object v0
.end method
