.class public final Lrb/l$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrb/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final b:Lrb/l$d;

.field public static final c:Lrb/l$d;

.field public static final d:Lrb/l$d;

.field public static final e:Lrb/l$d;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrb/l$d;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lrb/l$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/l$d;->b:Lrb/l$d;

    new-instance v0, Lrb/l$d;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lrb/l$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/l$d;->c:Lrb/l$d;

    new-instance v0, Lrb/l$d;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lrb/l$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/l$d;->d:Lrb/l$d;

    new-instance v0, Lrb/l$d;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lrb/l$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/l$d;->e:Lrb/l$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrb/l$d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrb/l$d;->a:Ljava/lang/String;

    return-object v0
.end method
