.class final Lg$a$a;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/a<",
        "Lh;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg$a$a;

    invoke-direct {v0}, Lg$a$a;-><init>()V

    sput-object v0, Lg$a$a;->a:Lg$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lh;
    .locals 1

    sget-object v0, Lh;->a:Lh;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg$a$a;->a()Lh;

    move-result-object v0

    return-object v0
.end method
