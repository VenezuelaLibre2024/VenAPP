.class public final Ln9/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Ln9/e$a;->a:Ljava/lang/String;

    iput-object v0, p0, Ln9/e$a;->b:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic d(Ln9/e$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ln9/e$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic e(Ln9/e$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ln9/e$a;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a()Ln9/e;
    .locals 2

    new-instance v0, Ln9/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ln9/e;-><init>(Ln9/e$a;Ln9/i;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ln9/e$a;
    .locals 0

    iput-object p1, p0, Ln9/e$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Ln9/e$a;
    .locals 0

    iput-object p1, p0, Ln9/e$a;->a:Ljava/lang/String;

    return-object p0
.end method
