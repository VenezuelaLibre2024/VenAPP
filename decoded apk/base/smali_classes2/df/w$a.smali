.class public final Ldf/w$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Ldf/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldf/w$a;

    invoke-direct {v0}, Ldf/w$a;-><init>()V

    sput-object v0, Ldf/w$a;->a:Ldf/w$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ldf/w;
    .locals 2

    sget-object v0, Lzb/c;->a:Lzb/c;

    invoke-static {v0}, Lzb/n;->a(Lzb/c;)Lzb/g;

    move-result-object v0

    const-class v1, Ldf/w;

    invoke-virtual {v0, v1}, Lzb/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Firebase.app[SessionDatastore::class.java]"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ldf/w;

    return-object v0
.end method
