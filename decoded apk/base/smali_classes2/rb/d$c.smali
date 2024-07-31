.class public final Lrb/d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrb/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lrb/d$c;

.field public static final c:Lrb/d$c;

.field public static final d:Lrb/d$c;

.field public static final e:Lrb/d$c;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrb/d$c;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lrb/d$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/d$c;->b:Lrb/d$c;

    new-instance v0, Lrb/d$c;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lrb/d$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/d$c;->c:Lrb/d$c;

    new-instance v0, Lrb/d$c;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lrb/d$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/d$c;->d:Lrb/d$c;

    new-instance v0, Lrb/d$c;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lrb/d$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/d$c;->e:Lrb/d$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrb/d$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrb/d$c;->a:Ljava/lang/String;

    return-object v0
.end method
