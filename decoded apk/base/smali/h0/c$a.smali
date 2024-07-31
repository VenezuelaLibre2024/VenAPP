.class public final Lh0/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lh0/a;

.field private b:Lh0/d;

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lh0/a;->c:Lh0/a;

    iput-object v0, p0, Lh0/c$a;->a:Lh0/a;

    const/4 v0, 0x0

    iput-object v0, p0, Lh0/c$a;->b:Lh0/d;

    const/4 v0, 0x0

    iput v0, p0, Lh0/c$a;->c:I

    return-void
.end method

.method private constructor <init>(Lh0/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lh0/a;->c:Lh0/a;

    iput-object v0, p0, Lh0/c$a;->a:Lh0/a;

    const/4 v0, 0x0

    iput-object v0, p0, Lh0/c$a;->b:Lh0/d;

    const/4 v0, 0x0

    iput v0, p0, Lh0/c$a;->c:I

    invoke-virtual {p1}, Lh0/c;->b()Lh0/a;

    move-result-object v0

    iput-object v0, p0, Lh0/c$a;->a:Lh0/a;

    invoke-virtual {p1}, Lh0/c;->d()Lh0/d;

    move-result-object v0

    iput-object v0, p0, Lh0/c$a;->b:Lh0/d;

    invoke-virtual {p1}, Lh0/c;->c()Lh0/b;

    invoke-virtual {p1}, Lh0/c;->a()I

    move-result p1

    iput p1, p0, Lh0/c$a;->c:I

    return-void
.end method

.method public static b(Lh0/c;)Lh0/c$a;
    .locals 1

    new-instance v0, Lh0/c$a;

    invoke-direct {v0, p0}, Lh0/c$a;-><init>(Lh0/c;)V

    return-object v0
.end method


# virtual methods
.method public a()Lh0/c;
    .locals 5

    new-instance v0, Lh0/c;

    iget-object v1, p0, Lh0/c$a;->a:Lh0/a;

    iget-object v2, p0, Lh0/c$a;->b:Lh0/d;

    const/4 v3, 0x0

    iget v4, p0, Lh0/c$a;->c:I

    invoke-direct {v0, v1, v2, v3, v4}, Lh0/c;-><init>(Lh0/a;Lh0/d;Lh0/b;I)V

    return-object v0
.end method

.method public c(I)Lh0/c$a;
    .locals 0

    iput p1, p0, Lh0/c$a;->c:I

    return-object p0
.end method

.method public d(Lh0/a;)Lh0/c$a;
    .locals 0

    iput-object p1, p0, Lh0/c$a;->a:Lh0/a;

    return-object p0
.end method

.method public e(Lh0/d;)Lh0/c$a;
    .locals 0

    iput-object p1, p0, Lh0/c$a;->b:Lh0/d;

    return-object p0
.end method
