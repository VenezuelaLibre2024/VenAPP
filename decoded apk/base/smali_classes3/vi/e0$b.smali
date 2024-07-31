.class public final Lvi/e0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/e0$b$a;
    }
.end annotation


# instance fields
.field private final a:Lvi/g1;

.field private final b:Ljava/lang/Object;

.field public c:Lvi/h;


# direct methods
.method private constructor <init>(Lvi/g1;Ljava/lang/Object;Lvi/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "status"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/g1;

    iput-object p1, p0, Lvi/e0$b;->a:Lvi/g1;

    iput-object p2, p0, Lvi/e0$b;->b:Ljava/lang/Object;

    iput-object p3, p0, Lvi/e0$b;->c:Lvi/h;

    return-void
.end method

.method synthetic constructor <init>(Lvi/g1;Ljava/lang/Object;Lvi/h;Lvi/e0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lvi/e0$b;-><init>(Lvi/g1;Ljava/lang/Object;Lvi/h;)V

    return-void
.end method

.method public static d()Lvi/e0$b$a;
    .locals 2

    new-instance v0, Lvi/e0$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvi/e0$b$a;-><init>(Lvi/e0$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvi/e0$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public b()Lvi/h;
    .locals 1

    iget-object v0, p0, Lvi/e0$b;->c:Lvi/h;

    return-object v0
.end method

.method public c()Lvi/g1;
    .locals 1

    iget-object v0, p0, Lvi/e0$b;->a:Lvi/g1;

    return-object v0
.end method
