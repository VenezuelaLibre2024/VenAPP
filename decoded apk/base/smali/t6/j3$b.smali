.class public final Lt6/j3$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/j3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt6/j3$b$a;
    }
.end annotation


# static fields
.field public static final b:Lt6/j3$b;

.field private static final c:Ljava/lang/String;

.field public static final d:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/j3$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lt8/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt6/j3$b$a;

    invoke-direct {v0}, Lt6/j3$b$a;-><init>()V

    invoke-virtual {v0}, Lt6/j3$b$a;->e()Lt6/j3$b;

    move-result-object v0

    sput-object v0, Lt6/j3$b;->b:Lt6/j3$b;

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/j3$b;->c:Ljava/lang/String;

    new-instance v0, Lt6/k3;

    invoke-direct {v0}, Lt6/k3;-><init>()V

    sput-object v0, Lt6/j3$b;->d:Lt6/o$a;

    return-void
.end method

.method private constructor <init>(Lt8/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/j3$b;->a:Lt8/l;

    return-void
.end method

.method synthetic constructor <init>(Lt8/l;Lt6/j3$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/j3$b;-><init>(Lt8/l;)V

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lt6/j3$b;
    .locals 0

    invoke-static {p0}, Lt6/j3$b;->d(Landroid/os/Bundle;)Lt6/j3$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lt6/j3$b;)Lt8/l;
    .locals 0

    iget-object p0, p0, Lt6/j3$b;->a:Lt8/l;

    return-object p0
.end method

.method private static d(Landroid/os/Bundle;)Lt6/j3$b;
    .locals 3

    sget-object v0, Lt6/j3$b;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Lt6/j3$b;->b:Lt6/j3$b;

    return-object p0

    :cond_0
    new-instance v0, Lt6/j3$b$a;

    invoke-direct {v0}, Lt6/j3$b$a;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Lt6/j3$b$a;->a(I)Lt6/j3$b$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lt6/j3$b$a;->e()Lt6/j3$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lt6/j3$b;->a:Lt8/l;

    invoke-virtual {v3}, Lt8/l;->c()I

    move-result v3

    if-ge v2, v3, :cond_0

    iget-object v3, p0, Lt6/j3$b;->a:Lt8/l;

    invoke-virtual {v3, v2}, Lt8/l;->b(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sget-object v2, Lt6/j3$b;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lt6/j3$b;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lt6/j3$b;

    iget-object v0, p0, Lt6/j3$b;->a:Lt8/l;

    iget-object p1, p1, Lt6/j3$b;->a:Lt8/l;

    invoke-virtual {v0, p1}, Lt8/l;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lt6/j3$b;->a:Lt8/l;

    invoke-virtual {v0}, Lt8/l;->hashCode()I

    move-result v0

    return v0
.end method
