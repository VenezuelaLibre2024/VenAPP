.class public final Lkb/i0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkb/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Lkb/i0$a;

.field public static final c:Lkb/i0$a;

.field public static final d:Lkb/i0$a;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkb/i0$a;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lkb/i0$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/i0$a;->b:Lkb/i0$a;

    new-instance v0, Lkb/i0$a;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lkb/i0$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/i0$a;->c:Lkb/i0$a;

    new-instance v0, Lkb/i0$a;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lkb/i0$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/i0$a;->d:Lkb/i0$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/i0$a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkb/i0$a;->a:Ljava/lang/String;

    return-object v0
.end method