.class public final Lrb/l$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrb/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lrb/l$c;

.field public static final c:Lrb/l$c;

.field public static final d:Lrb/l$c;

.field public static final e:Lrb/l$c;

.field public static final f:Lrb/l$c;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrb/l$c;

    const-string v1, "SHA1"

    invoke-direct {v0, v1}, Lrb/l$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/l$c;->b:Lrb/l$c;

    new-instance v0, Lrb/l$c;

    const-string v1, "SHA224"

    invoke-direct {v0, v1}, Lrb/l$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/l$c;->c:Lrb/l$c;

    new-instance v0, Lrb/l$c;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Lrb/l$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/l$c;->d:Lrb/l$c;

    new-instance v0, Lrb/l$c;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Lrb/l$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/l$c;->e:Lrb/l$c;

    new-instance v0, Lrb/l$c;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Lrb/l$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrb/l$c;->f:Lrb/l$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrb/l$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrb/l$c;->a:Ljava/lang/String;

    return-object v0
.end method
