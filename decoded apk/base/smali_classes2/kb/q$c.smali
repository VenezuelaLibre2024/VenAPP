.class public final Lkb/q$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkb/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lkb/q$c;

.field public static final c:Lkb/q$c;

.field public static final d:Lkb/q$c;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkb/q$c;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lkb/q$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/q$c;->b:Lkb/q$c;

    new-instance v0, Lkb/q$c;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lkb/q$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/q$c;->c:Lkb/q$c;

    new-instance v0, Lkb/q$c;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lkb/q$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/q$c;->d:Lkb/q$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/q$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkb/q$c;->a:Ljava/lang/String;

    return-object v0
.end method
