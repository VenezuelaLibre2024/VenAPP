.class public final Lcom/facebook/internal/e0$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/e0$f$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/facebook/internal/e0$f$a;


# instance fields
.field private a:Lcom/facebook/internal/e0$e;

.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/internal/e0$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/e0$f$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/internal/e0$f;->c:Lcom/facebook/internal/e0$f$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/internal/e0$f;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/internal/e0$f;Lcom/facebook/internal/e0$e;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/internal/e0$f;->a:Lcom/facebook/internal/e0$e;

    return-void
.end method

.method public static final synthetic b(Lcom/facebook/internal/e0$f;I)V
    .locals 0

    iput p1, p0, Lcom/facebook/internal/e0$f;->b:I

    return-void
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget v0, p0, Lcom/facebook/internal/e0$f;->b:I

    return v0
.end method
